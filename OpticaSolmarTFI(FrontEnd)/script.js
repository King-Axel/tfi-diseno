document.addEventListener("DOMContentLoaded", () => {
  const addFrameButton = document.getElementById("addFrame");
  const removeFrameButton = document.getElementById("removeFrame");
  const selectFrame = document.getElementById("selectFrame");
  const framePrice = document.getElementById("framePrice");

  // Función para alternar la visibilidad de los elementos
  const toggleFrame = (show) => {
    selectFrame.classList.toggle("d-none", !show);
    removeFrameButton.classList.toggle("d-none", !show);
    framePrice.classList.toggle("d-none", !show);
    addFrameButton.classList.toggle("d-none", show);
  };

  // Evento para añadir el segundo armazón
  addFrameButton.addEventListener("click", (e) => {
    e.preventDefault();
    toggleFrame(true);
  });

  // Evento para cancelar (eliminar) el segundo armazón
  removeFrameButton.addEventListener("click", (e) => {
    e.preventDefault();
    toggleFrame(false);
    selectFrame.selectedIndex = 0; // Reiniciar la selección
  });
});

//Creo un objeto precio de cristal de tipo clave:valor
const precioCristal = {
  "ORG LAB SHIBA 1.6": 7000,
  "ORG LAB SHIBA 1.7": 7500,
  "ORG LAB SHIBA 1.8": 8000,
};

//Busco el select y el div de lejos
const selcriLejos = document.querySelectorAll(".seleccionarCristalesLejos");
const preLejos = document.querySelectorAll(".precioCristalesLejos");

selcriLejos[0].addEventListener("change",function(){
  let cristalSeleccionado = selcriLejos[0].value;
  if(precioCristal[cristalSeleccionado]){
    preLejos[0].textContent = `Precio: ${precioCristal[cristalSeleccionado]}`;
    actualizarTotal();
  }else{
    preLejos[0].textContent = "";
  }
});

selcriLejos[1].addEventListener("change",function(){
  let cristalSeleccionado = selcriLejos[1].value;
  if(precioCristal[cristalSeleccionado]){
    preLejos[1].textContent = `Precio: ${precioCristal[cristalSeleccionado]}`;
    actualizarTotal();
  }else{
    preLejos[1].textContent = "";
  }
});

const selcriCerca = document.querySelectorAll(".seleccionarCristalesCerca");
const preCerca = document.querySelectorAll(".precioCristalesCerca");

selcriCerca[0].addEventListener("change",function(){
  let cristalSeleccionado = selcriCerca[0].value;
  if(precioCristal[cristalSeleccionado]){
    preCerca[0].textContent = `Precio: ${precioCristal[cristalSeleccionado]}`;
  }else{
    preCerca[0].textContent = "";
  }
});

selcriCerca[1].addEventListener("change",function(){
  let cristalSeleccionado = selcriCerca[1].value;
  if(precioCristal[cristalSeleccionado]){
    preCerca[1].textContent = `Precio: ${precioCristal[cristalSeleccionado]}`;
  }else{
    preCerca[1].textContent = "";
  }
});

//Creo el objeto precioTratamiento con el formato clave:valor
const precioTratamiento = {
  "Tratamiento 1": 3000,
  "Tratamiento 2": 3600,
  "Tratamiento 3": 4000,
};

//obtengo los select del tratamiento lejos y los precios del tratamiento lejos
const selTratLejos = document.querySelectorAll(".seleccionarTratamientosLejos");
const preTratLejos = document.querySelectorAll(".precioTratamientosLejos");


selTratLejos[0].addEventListener("change",function(){
  let tratamientoSeleccionado = selTratLejos[0].value;
  if(precioTratamiento[tratamientoSeleccionado]){
    preTratLejos[0].textContent = `Precio: ${precioTratamiento[tratamientoSeleccionado]}`;
  }else{
    preTratLejos[0].textContent = "";
  }
});

selTratLejos[1].addEventListener("change",function(){
  let tratamientoSeleccionado = selTratLejos[1].value;
  if(precioTratamiento[tratamientoSeleccionado]){
    preTratLejos[1].textContent = `Precio: ${precioTratamiento[tratamientoSeleccionado]}`;
  }else{
    preTratLejos[1].textContent = "";
  }
});

const selTratCerca = document.querySelectorAll(".seleccionarTratamientosCerca");
const preTratCerca = document.querySelectorAll(".precioTratamientosCerca");

selTratCerca[0].addEventListener("change",function(){
  let tratamientoSeleccionado = selTratCerca[0].value;
  if(precioTratamiento[tratamientoSeleccionado]){
    preTratCerca[0].textContent = `Precio: ${precioTratamiento[tratamientoSeleccionado]}`;
  }else{
    preTratCerca[0].textContent = "";
  }
});

selTratCerca[1].addEventListener("change",function(){
  let tratamientoSeleccionado = selTratCerca[1].value;
  if(precioTratamiento[tratamientoSeleccionado]){
    preTratCerca[1].textContent = `Precio: ${precioTratamiento[tratamientoSeleccionado]}`;
  }else{
    preTratCerca[1].textContent = "";
  }
});

const precioArmazon = {
  "Armazón Propio": 0,
  REE52180150: 10000,
  REE53097167: 15000,
};

const selArmazon = document.querySelector(".seleccionarArmazon");
const preArmazon = document.querySelector(".precioArmazon");

selArmazon.addEventListener("change", function () {
  let armazonSeleccionado = selArmazon.value;

  if (precioArmazon[armazonSeleccionado]) {
    preArmazon.textContent = `Precio: ${precioArmazon[armazonSeleccionado]}`;
  } else {
    preArmazon.textContent = "";
  }
});

const selArmazon2 = document.querySelector(".seleccionarArmazon2");
const preArmazon2 = document.querySelector(".precioArmazon2");

selArmazon2.addEventListener("change", function () {
    let armazonSeleccionado = selArmazon2.value;
  
    if (precioArmazon[armazonSeleccionado]) {
      preArmazon2.textContent = `Precio: ${precioArmazon[armazonSeleccionado]}`;
    } else {
      preArmazon2.textContent = "";
    }
  });


function actualizarTotal(){
    const precioCristales = document.querySelectorAll(".precioCristalesLejos");
    const precioTratamientos = document.querySelectorAll(".precioTratamientosLejos");
    const totalActualizado = document.querySelector(".obtenerTotalActualizado");
    let total = 0;
    precioCristales.forEach(preciocristal =>{
      console.log(preciocristal);
      const texto = preciocristal.textContent;
      const valorTexto = texto.match(/(\d+)/);
      const valorFloat = parseFloat(valorTexto);
      console.log(valorFloat);
      total += valorFloat;
    })
    totalActualizado.textContent = `Total: ${total}`;
}