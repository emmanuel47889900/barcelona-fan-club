function postMessage() {
    let message = document.querySelector("textarea").value;
    if (message.trim() !== "") {
        let messageDiv = document.createElement("div");
        messageDiv.textContent = message;
        document.getElementById("messages").appendChild(messageDiv);
        document.querySelector("textarea").value = "";
    }
}
function postMessage() {
    let message = document.querySelector("textarea").value;
    if (message.trim() !== "") {
        let messageDiv = document.createElement("div");
        messageDiv.textContent = message;
        document.getElementById("messages").appendChild(messageDiv);
        document.querySelector("textarea").value = "";
        
        // Save to localStorage (optional)
        localStorage.setItem('messages', document.getElementById("messages").innerHTML);
    }
}

// Retrieve saved messages on page load (optional)
window.onload = function() {
    if (localStorage.getItem('messages')) {
        document.getElementById("messages").innerHTML = localStorage.getItem('messages');
    }
};
