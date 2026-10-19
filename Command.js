// RECEPTOR
// Contiene la lógica real de negocio (lo que el objeto sabe hacer)
class Luz {
    encender() {
        console.log("La luz está ENCENDIDA");
    }

    apagar() {
        console.log("La luz está APAGADA");
    }
}

// INTERFAZ / COMANDO BASE (Command) 
// Define la estructura común para todos los comandos
class Comando {
    constructor(luz) {
        this.luz = luz;
    }
    
    ejecutar() {
        throw new Error("El método 'ejecutar()' debe ser implementado");
    }
}

// COMANDOS 

class ComandoEncenderLuz extends Comando {
    ejecutar() {
        this.luz.encender(); 
    }
}

class ComandoApagarLuz extends Comando {
    ejecutar() {
        this.luz.apagar();
    }
}

// INVOCADOR 
class ControlRemoto {
    setComando(comando) {
        this.comando = comando;
    }

    presionarBoton() {
        this.comando.ejecutar();
    }
}


// CLIENTE 


// Creamos el receptor (el objeto que realiza la acción)
const accLuz = new Luz();

// Creamos los comandos concretos pasándole el receptor
const encender = new ComandoEncenderLuz(accLuz);
const apagar = new ComandoApagarLuz(accLuz);

// Creamos el invocador (por ejemplo, un control remoto)
const control = new ControlRemoto();

// Usamos el comando para encender
control.setComando(encender);
control.presionarBoton(); // Salida:La luz está ENCENDIDA

// Usamos el comando para apagar
control.setComando(apagar);
control.presionarBoton(); // Salida: La luz está APAGADA



para correr "capeta">> nombredelarchivo.js
