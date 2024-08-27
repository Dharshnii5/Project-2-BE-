document.getElementById("registrationForm").addEventListener("submit", function(e) {
    e.preventDefault();
    // Perform validation checks
    const formData = new FormData(this);
    fetch('/api/patients', {
        method: 'POST',
        body: JSON.stringify(Object.fromEntries(formData)),
        headers: {
            'Content-Type': 'application/json'
        }
    })
    .then(response => response.json())
    .then(data => console.log(data))
    .catch(error => console.error('Error:', error));
});
