const eventos = new EventTarget();

const esperar = (ms) => new Promise((resolve) => setTimeout(resolve, ms));

eventos.addEventListener("compra", async (e) => {
    const { producto, cantidad } = e.detail;
    await esperar(1000);
    console.log(`Inventario actualizado: -${cantidad} ${producto}`);
});

eventos.addEventListener("compra", async (e) => {
    const { cantidad, precio } = e.detail;
    await esperar(500);
    console.log(`Factura generada por $${cantidad * precio}`);
});

eventos.addEventListener("compra", async (e) => {
    await esperar(1500);
    console.log(`Correo enviado a ${e.detail.cliente}`);
});

async function realizarCompra(producto, cantidad, precio, cliente) {
    console.log("Procesando compra...");
    await esperar(300);

    eventos.dispatchEvent(
        new CustomEvent("compra", {
            detail: { producto, cantidad, precio, cliente }
        })
    );

    console.log("Compra confirmada (sin esperar a los consumidores)");
}

realizarCompra("Martillo", 2, 25000, "cliente@correo.com");