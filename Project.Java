function copyText() {
    const sourceText = document.getElementById('source-text').value;
    const destinationText = document.getElementById('destination-text');
    const errorMessage = document.getElementById('error-message');

    // Regular expression for alphanumeric check
    const alphanumericRegex = /^[a-zA-Z0-9\s]+$/;

    // Validation checks
    if (sourceText === "") {
        errorMessage.textContent = "Source text cannot be empty.";
        destinationText.value = "";
    } else if (!alphanumericRegex.test(sourceText)) {
        errorMessage.textContent = "Source text must be alphanumeric.";
        destinationText.value = "";
    } else {
        errorMessage.textContent = "";
        destinationText.value = sourceText;
    }
}
