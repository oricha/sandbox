let { getUsuariosSync } = require('./usuarios/usuario');


console.log('Inicio de programa');

let usuario1 = getUsuariosSync(1);
console.log('Usuario1', usuario1);


let usuario2 = getUsuariosSync(2);
console.log('Usuario2', usuario2);


console.log('Hola mundo!');
