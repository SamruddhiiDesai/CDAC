let projects = [];
let editIndex = -1; // Keeps track of the project being edited

document.getElementById("form").addEventListener("submit", handleProjectSubmission);

function handleProjectSubmission(event) {
    event.preventDefault();
    
    const title = document.getElementById("title").value;
    const technologiesUsed = document.getElementById("technologiesUsed").value;
    const languageUsed = document.getElementById("languageUsed").value;
    const description = document.getElementById("description").value;
    const githubLink = document.getElementById("githubLink").value;
    const liveDemoLink = document.getElementById("liveDemoLink").value;
    const imageFile = document.getElementById("imageFile").files[0];

    if (imageFile) {
        const reader = new FileReader();
        reader.onload = function (e) {
            const project = {
                title,
                technologiesUsed,
                languageUsed,
                description,
                image: e.target.result,
                githubLink,
                liveDemoLink
            };

            if (editIndex === -1) {
                projects.push(project); // Add new project
            } else {
                projects[editIndex] = project; // Update existing project
                editIndex = -1; // Reset edit index
            }

            displayProjects();
            document.getElementById("form").reset();
            hideProjectForm();
        };
        reader.readAsDataURL(imageFile);
    } else {
        const project = {
            title,
            technologiesUsed,
            languageUsed,
            description,
            image: projects[editIndex] ? projects[editIndex].image : '',
            githubLink,
            liveDemoLink
        };

        if (editIndex === -1) {
            projects.push(project); 
        } else {
            projects[editIndex] = project; 
            editIndex = -1; 
        }

        displayProjects();
        document.getElementById("form").reset();
        hideProjectForm();
    }
}

function displayProjects() {
    const projectsList = document.getElementById("projects-list");
    projectsList.innerHTML = "";
    projects.forEach((project, index) => {
        const projectHTML = `
            <div class="card shadow mx-auto mb-4" style="max-width: 800px;">
                <h3 style="margin-left:40px">${project.title}</h3>
                <p style="margin-left:40px">Technologies Used: ${project.technologiesUsed}</p>
                <p style="margin-left:40px">Language Used: ${project.languageUsed}</p>
                <p style="margin-left:40px">${project.description}</p>
                <img style="width:400px;height:300px;margin-left:60px" src="${project.image}" alt="Project Image" class="img-fluid">
                <p>
                    <a href="${project.githubLink}" target="_blank">Github Link</a> |
                    <a href="${project.liveDemoLink}" target="_blank">Live Demo Link</a>
                </p>
                <div style="display: flex; gap: 10px;">
                    <button style="margin-left:70px; width: 200px; background-color: #ffc107; border: none; color: #fff; padding: 10px 15px; transition: background-color 0.3s, transform 0.3s;"
                            onmouseover="this.style.backgroundColor='#e0a800'; this.style.transform='scale(1.05');"
                            onmouseout="this.style.backgroundColor='#ffc107'; this.style.transform='scale(1)';"
                            onclick="editProject(${index})">Edit</button>
                    <button style="width: 200px; background-color: #dc3545; border: none; color: #fff; padding: 10px 15px; transition: background-color 0.3s, transform 0.3s;"
                            onmouseover="this.style.backgroundColor='#c82333'; this.style.transform='scale(1.05');"
                            onmouseout="this.style.backgroundColor='#dc3545'; this.style.transform='scale(1)';"
                            onclick="deleteProject(${index})">Delete</button>
                </div>
            </div>
        `;
        projectsList.insertAdjacentHTML("beforeend", projectHTML);
    });
}

function deleteProject(index) {
    if (confirm("Are you sure you want to delete this project?")) {
        projects.splice(index, 1);
        displayProjects();
    }
}

function editProject(index) {
    const project = projects[index];
    document.getElementById("title").value = project.title;
    document.getElementById("technologiesUsed").value = project.technologiesUsed;
    document.getElementById("languageUsed").value = project.languageUsed;
    document.getElementById("description").value = project.description;
    document.getElementById("githubLink").value = project.githubLink;
    document.getElementById("liveDemoLink").value = project.liveDemoLink;
    editIndex = index; // Set the index to be edited
    showProjectForm();
}

function showProjectForm() {
    document.getElementById("project-form").style.display = "block";
}

function hideProjectForm() {
    document.getElementById("project-form").style.display = "none";
}
