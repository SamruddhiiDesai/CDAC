// // Sample project data
// const project = {
//    title: "",
//    description: "Implemented a highly accessible web-based Leave Management System for staff, clerk, and HOD, streamlining leave processes and enabling faculty to effortlessly request and track their own leave, resulting in a 40 percent reduction in administrative workload",
//    image: " ",
//    githubLink: "https://github.com",
//    liveDemoLink: "https://example.com",
//     feedback: []
// };

// // Function to display project details
// function displayProjectDetails() {
//     document.getElementById("project-title").innerText = project.title;
//     document.getElementById("project-description").innerText = project.description;
//     document.getElementById("project-image").src = project.image;
// }

// // Function to display feedback
// function displayFeedback() {
//     const feedbackList = document.getElementById("feedback-list");
//     feedbackList.innerHTML = ""; // Clear previous feedback
//     project.feedback.forEach((item) => {
//         const li = document.createElement("li");
//         li.className = "list-group-item";
//         li.innerHTML = `<strong>${item.name}</strong> - ${item.message}`;
//         feedbackList.appendChild(li);
//     });
// }

// // Function to handle feedback submission
// function handleFeedbackSubmission(event) {
//     event.preventDefault(); // Prevent form submission
//     const name = document.getElementById("name").value ;
//     const email = document.getElementById("email").value;
//     const message = document.getElementById("feedback").value;
//     project.feedback.push({ name, email, message });
//     displayFeedback();
//     document.getElementById("feedback-form").reset(); // Reset form fields
// }

// // Initial display of project details
// displayProjectDetails();

// // Add event listener to feedback form
// document.getElementById("feedback-form").addEventListener("submit", handleFeedbackSubmission);
// Sample project data
const project = {
    title: "",
    description: "",
    image: " ", // Add image URL if needed
    githubLink: "https://github.com",
    liveDemoLink: "https://example.com",
    feedback: []
};

// Function to display project details
function displayProjectDetails() {
    document.getElementById("project-title").innerText = project.title;
    document.getElementById("project-description").innerText = project.description;
    // Uncomment below line to display an image if provided
    // document.getElementById("project-image").src = project.image;
}

// Function to display feedback
function displayFeedback() {
    const feedbackList = document.getElementById("feedback-list");
    feedbackList.innerHTML = ""; // Clear previous feedback
    project.feedback.forEach((item) => {
        const li = document.createElement("li");
        li.className = "list-group-item";
        li.innerHTML = `<strong>${item.name}</strong> - ${item.message}`; // Use item.message for correct reference
        feedbackList.appendChild(li);
    });
}

// Function to handle feedback submission
function handleFeedbackSubmission(event) {
    event.preventDefault(); // Prevent form submission
    const name = document.getElementById("name").value;
    const email = document.getElementById("email").value;
    const message = document.getElementById("feedback").value;
    project.feedback.push({ name, email, message });
    displayFeedback(); // Display the feedback after submission
    document.getElementById("feedback-form").reset(); // Reset form fields
}

// Initial display of project details
displayProjectDetails();

// Add event listener to feedback form
document.getElementById("feedback-form").addEventListener("submit", handleFeedbackSubmission);
