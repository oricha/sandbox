let { getUsuario } = require('./usuarios/usuario');


console.log('Inicio de programa');

getUsuario(1, function (usuario1) {
    console.log('Usuario1', usuario1);
});

getUsuario(2, function (usuario2) {
    console.log('Usuario2', usuario2);
});

console.log('Hola mundo!');
