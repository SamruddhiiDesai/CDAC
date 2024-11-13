
// -------------------------------------------------------------------------------




function showProjectForm() {
    document.getElementById("project-form").style.display = "block";
}

function hideProjectForm() {
    document.getElementById("project-form").style.display = "none";
    document.getElementById("form").reset();
}

//-----------Load data intoprofile--------------------

function loadProjects() {
    fetch('http://localhost:4050/api/getAll')
        .then(response => response.json())
        .then(data => {
            const projectsList = document.getElementById("projects-list");  //craete array of string
            projectsList.innerHTML = data.map((project) => `
                <div class="card">
                <img style="height:200px" src="${project.imageUrl}" class="card-img-top" alt="${project.title}">
                    <div class="card-body">
                        <h5 class="card-title">${project.title}</h5>
                        <p class="card-text">${project.description}</p>
                        <button onclick="editProject(${project.id})">Edit</button>
                        <button onclick="deleteProject(${project.id})">Delete</button>
                       
                        

                    </div>
                </div>
            `).join("");
        })
        .catch(err => console.error("Error fetching projects: ", err));
}


//----------input project data after submit store to database table-----------------

document.getElementById("form").addEventListener("submit", function(event) {
    event.preventDefault();      //realod prevent

    const title = document.getElementById("title").value;
    const author = document.getElementById("author").value;
    const description = document.getElementById("description").value;
    const githubLink = document.getElementById("githubLink").value;
    const technologiesUsed = document.getElementById("technologiesUsed").value;
    const languageUsed = document.getElementById("languageUsed").value;
    const imageUrl=document.getElementById("imageUrl").value;
    const project = {   //req body  
        title, author, description, githubLink, technologiesUsed, languageUsed,imageUrl
    };

    fetch('http://localhost:4050/api/save', {
        method: 'POST',
        headers: {   
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(project)    //json object as stringyfy version of our object
    })
    .then(response => response.json())
    .then(() => {
        loadProjects();
        hideProjectForm();
    })
    .catch(err => console.error("Error saving project: ", err));
});
//we write also asyn await


//--------------------edit project data----------------------------

// function editProject(id) {
//     fetch(`http://localhost:4050/api/getAll`)
//         .then(response => response.json())
//         .then(data => {
//             const project = data.find(p => p.id === id);
//             document.getElementById("title").value = project.title;
//             document.getElementById("author").value = project.author;
//             document.getElementById("description").value = project.description;
//             document.getElementById("githubLink").value = project.githubLink;
//             document.getElementById("technologiesUsed").value = project.technologiesUsed;
//             document.getElementById("languageUsed").value = project.languageUsed;
//             showProjectForm();

        
        

            
//         });
// }



function editProject(id) {
    fetch(`http://localhost:4050/api/getAll`)
        .then(response => response.json())
        .then(data => {
            const project = data.find(p => p.id === id);
            document.getElementById("title").value = project.title;
            document.getElementById("author").value = project.author;
            document.getElementById("description").value = project.description;
            document.getElementById("githubLink").value = project.githubLink;
            document.getElementById("technologiesUsed").value = project.technologiesUsed;
            document.getElementById("languageUsed").value = project.languageUsed;
            showProjectForm();
            
            
        
        

            
        });
}


// function updateProject() {
//     const id = document.getElementById("projectId").value;
//     const updatedProject = {
//         id: id,
//         title: document.getElementById("title").value,
//         author: document.getElementById("author").value,
//         description: document.getElementById("description").value,
//         githubLink: document.getElementById("githubLink").value,
//         technologiesUsed: document.getElementById("technologiesUsed").value,
//         languageUsed: document.getElementById("languageUsed").value,
//         imageUrl: document.getElementById("imageUrl").value  
//     };

//     fetch(`http://localhost:4050/api/updateProfile`, {
//         method: 'PUT',
//         headers: {
//             'Content-Type': 'application/json'
//         },
//         body: JSON.stringify(updatedProject)
//     })
//     .then(response => response.json())
//     .then(result => {
//         if (result.message === "Profile updated successfully") {
//             alert("Profile updated successfully!");
//             //reload the project list
//         } else {
//             alert("Error updating profile: " + result.message);
//         }
//     })
//     .catch(error => {
//         console.error("Error:", error);
//         alert("error occurred  updating  profile.");
//     });
// }

// document.getElementById("updateButton").addEventListener("click", updateProject);

//----------------delete project data--------------------------

function deleteProject(id) {
    fetch('http://localhost:4050/api/deleteProfile', {
        method: 'DELETE',
        headers: { 'Content-Type': 'application/json' },
        body: JSON.stringify({ id })
    })
    .then(response => response.json())
    .then(() => {
        loadProjects();
    })
    .catch(err => console.error("Error deleting project: ", err));
}

loadProjects();



