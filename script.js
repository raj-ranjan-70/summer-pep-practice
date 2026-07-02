let count = 0;
function increment() {
    count++;

    const countElement = document.getElementById('count');

    countElement.textContent = count;
}