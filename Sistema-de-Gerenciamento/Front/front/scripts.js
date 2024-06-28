document.getElementById('emprestimoForm').addEventListener('submit', function(event) {
    event.preventDefault();

    const nomePessoa = document.getElementById('nomePessoa').value;
    const nomeObjeto = document.getElementById('nomeObjeto').value;
    const dataEmprestimo = document.getElementById('dataEmprestimo').value;
    const dataDevolucao = document.getElementById('dataDevolucao').value;

    const emprestimo = {
        nomePessoa: nomePessoa,
        nomeObjeto: nomeObjeto,
        dataEmprestimo: dataEmprestimo,
        dataDevolucao: dataDevolucao
    };

    fetch('http://localhost:8080/api/emprestimos', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(emprestimo)
    })
    .then(response => {
        if (!response.ok) {
            throw new Error('Network response was not ok ' + response.statusText);
        }
        return response.json();
    })
    .then(data => {
        document.getElementById('responseMessage').textContent = 'Empréstimo cadastrado com sucesso!';
        document.getElementById('emprestimoForm').reset();
    })
    .catch(error => {
        console.error('Error:', error);
        document.getElementById('responseMessage').textContent = 'Erro ao cadastrar empréstimo.';
    });
});
