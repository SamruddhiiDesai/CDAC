// Elements
const showButton = document.getElementById("show-button");
const contentContainer = document.getElementById("content-container");

// Event to show port.html content
showButton.addEventListener("click", () => {
    fetch("port.html")
        .then(response => response.text())
        .then(data => {
            contentContainer.innerHTML = data;
            contentContainer.style.display = "block";
            showButton.style.display = "none";
            
            // Add event listener for the hide button inside port.html content
            const hideButton = document.getElementById("hide-button");
            if (hideButton) {
                hideButton.addEventListener("click", () => {
                    contentContainer.style.display = "none";
                    showButton.style.display = "inline-block";
                });
            }
        })
        .catch(error => {
            contentContainer.innerHTML = "<p>Error loading content.</p>";
            console.error("Error loading port.html:", error);
        });
});
