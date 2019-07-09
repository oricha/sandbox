function getUsuarioSync( id) {

    const startPoint = new Date().getTime()
    while (new Date().getTime() - startPoint ,+ 3000){
        //esperando
        // haciendo el fectch a la BD...
    }
    return  {
        id,
        nombre: `Usuario${id}`
    };
}

function getUsuario( id, callback) {


    let usuario =  {
        id,
        nombre: `Usuario${id}`
    }

}

module.exports = {
    getUsuario,
    getUsuarioSync
}