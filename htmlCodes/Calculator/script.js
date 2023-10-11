let currentInput = '';
function appendToDisplay(value){
    currentInput += value;
    document.getElementById('result').value = currentInput;
}

function clearDisplay(){
    currentInput = '';
    document.getElementById('result').value = '';
}

function calculateResult(){
    try{
        let result = eval(currentInput);
        document.getElementById('result').value = result;
        currentInput = result;
    }catch(error){
        document.getElementById('result').value = 'Error';
        currentInput = '';
    }
}