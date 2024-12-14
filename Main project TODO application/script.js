const inputField = document.getElementById('todo-input');
const addButton = document.getElementById('add-btn');
const todoLst = document.getElementById('todo-list');
const completeCnt = document.getElementById('completed-count');
const totalCnt = document.getElementById('total-count');

let total_tasks = 0;
let completed_tasks = 0;

function addTodo() {
  const todoText = inputField.value.trim();
  if (todoText === '') return;

  const listItem = document.createElement('li');
  const span = document.createElement('span');
  span.textContent = todoText;
  const checkButton = document.createElement('button');
  checkButton.textContent = '✔';
  checkButton.className = 'check-btn';
  const deleteButton = document.createElement('button');
  deleteButton.textContent = '🗑️';
  deleteButton.className = 'delete-btn';
  listItem.appendChild(span);
  listItem.appendChild(checkButton);
  listItem.appendChild(deleteButton);
  todoLst.appendChild(listItem);  
  checkButton.addEventListener('click', () => {
    listItem.classList.toggle('completed');
    completed_tasks = document.querySelectorAll('.completed').length;
    updateStats();
  });
  deleteButton.addEventListener('click', () => {
    listItem.remove();
    total_tasks--;
    completed_tasks = document.querySelectorAll('.completed').length;
    updateStats();
  });
  total_tasks++;
  updateStats();
  inputField.value = '';
}

function updateStats() {
  totalCnt.textContent = `Total Tasks: ${total_tasks}`;
  completeCnt.textContent = `Completed: ${completed_tasks}`;
}

addButton.addEventListener('click', addTodo);

inputField.addEventListener('keypress', (e) => {
  if (e.key === 'Enter') addTodo();
});
