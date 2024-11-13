
document.addEventListener("DOMContentLoaded", function () {  //  initial HTML document has  completely loaded 
    const projectsList = document.getElementById("projects-list");

    
    fetch('http://localhost:4050/api/getAll')
        .then(response => response.json()) 
        .then(projects => {
            // Map over the projects array to generate HTML for each project //backtich use$
            projectsList.innerHTML = projects.map(project => `  
                <div class="col-md-4 mb-4">
                    <div class="card">
                        <img style="height:200px" src="${project.imageUrl}" class="card-img-top" alt="${project.title}">
                        <div class="card-body">
                            <h5 class="card-title">${project.title}</h5>
                            <p class="card-text">${project.description}</p>
                            <a href="project-detailsdyna.html?id=${project.id}" class="btn btn-dark">View Details</a>
                        </div>
                    </div>
                </div>
            `).join(""); // Join to form a single string of HTML
        })
        .catch(err => {
            console.error("Error fetching projects: ", err);
            projectsList.innerHTML = "<p>Unable to load projects.</p>"; 
        });
});



