document.addEventListener("DOMContentLoaded", function () {
    const form = document.getElementById("surveyForm");
    const submitBtn = document.getElementById("submitBtn");
    const resetBtn = document.getElementById("resetBtn");

    form.addEventListener("submit", function (event) {
        event.preventDefault();

        // Validate the form fields and gather values
        const firstName = document.getElementById("firstName").value;
        const lastName = document.getElementById("lastName").value;
        const dob = document.getElementById("dob").value;
        const country = document.getElementById("country").value;
        const genderElements = document.querySelectorAll('input[name="gender"]:checked');
        const gender = [...genderElements].map(el => el.value).join(", ");
        const profession = document.getElementById("profession").value;
        const email = document.getElementById("email").value;
        const mobile = document.getElementById("mobile").value;

        // Display a popup with the selected values
        const message = `First Name: ${firstName}\nLast Name: ${lastName}\nDate of Birth: ${dob}\nCountry: ${country}\nGender: ${gender}\nProfession: ${profession}\nEmail: ${email}\nMobile Number: ${mobile}`;
        alert(message);

        // Reset the form
        form.reset();
    });

    resetBtn.addEventListener("click", function () {
        form.reset();
    });
});
