// Lấy form element
const form = document.getElementById('myForm');

form.addEventListener('submit', function(event) {
    event.preventDefault(); // Ngăn chặn form submit mặc định

    // Lấy giá trị các input
    const name = document.getElementById('name').value;
    const email = document.getElementById('email').value;
    const age = document.getElementById('age').value;

    // Gom các giá trị thành một object
    const formData = {
        name: name,
        email: email,
        age: age
    };

    // Gửi object đến server (ví dụ: sử dụng AJAX)
    fetch('/hello2', {
        method: 'GET',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(formData)
    })
        .then(response => {
            // Xử lý phản hồi từ server
            console.log('User saved successfully!');
        })
        .catch(error => {
            // Xử lý lỗi
            console.error('Error saving user:', error);
        });
});