"use strict";
// Call the dataTables jQuery plugin
$(document).ready(function () {
  cargarUsuarios();
  $('#userTable').DataTable();
});

async function cargarUsuarios() {
  const promise = await fetch("get", {
    method: "GET",
    headers: {
      Accept: "application/json",
      "Content-Type": "application/json"
    }
  })
  .then 
  // const usuarios = promise.json();
  const usuarios = await promise;
  console.log(typeof usuarios);
  console.log(usuarios);
  console.log(Promise.resolve(usuarios));
  // for (const key in usuarios) {
  //   console.log(key);
  // }

  let filas = "<tr>";

  filas += "<td>" + "61" + "</td>";
  filas += "<td>" + "Tiger Nixon" + "</td>";
  filas += "<td>" + "tiger@gmail.com" + "</td>";
  filas += "<td>" + "123456" + "</td>";
  filas += '<td><a href="#" class="btn btn-danger btn-circle btn-sm"><i class="fas fa-trash"></i></a></td>';

  filas += "</tr";

}