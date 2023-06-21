package com.example.tarea_intranetv2;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable{
    //Paneles
    @FXML
    AnchorPane panelPrincipal, panelCarrera, panelEstudiante, panelBuscar, panelTabla;

    //Txt Registro Carrera
    @FXML
    TextField txtNombreCarrera, txtCodigoCarrera, txtCantidadSemestres;

    //Datos Registro Estudiante
    @FXML
    TextField txtNombre, txtRut, txtMatricula;
    @FXML
    ComboBox<String> comboCarrera;

    //Datos Busqueda Estudiante(s)
    @FXML
    TextField txtNombreBuscar;
    @FXML
    ComboBox<String> comboCarreraBuscar;
    
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    //Limpiar Casillas
    @FXML
    public void limpiarRegistroCarrera(){
        txtNombreCarrera.setText(null);
        txtCodigoCarrera.setText(null);
        txtCantidadSemestres.setText(null);
    }
    @FXML
    public void limpiarRegistroEstudiante(){
        txtNombre.setText(null);
        txtRut.setText(null);
        txtMatricula.setText(null);
        comboCarrera.getSelectionModel().select(null);
    }
    @FXML
    public void limpiarBusquedaEstudiante(){
        txtNombreBuscar.setText(null);
        comboCarreraBuscar.getSelectionModel().select(null);
    }

    //Navegar en el Software
    @FXML
    public void cerrarPrograma(){
        Platform.exit();
        System.exit(0);
    }
    @FXML
    public void abrirPanelRegistrarCarrera(){
        panelPrincipal.setVisible(false);
        panelCarrera.setVisible(true);
    }
    @FXML
    public void abrirPanelRegistrarEstudiante(){
        panelPrincipal.setVisible(false);
        panelEstudiante.setVisible(true);
    }
    @FXML
    public void abrirPanelBuscarEstudiantes(){
        panelPrincipal.setVisible(false);
        panelBuscar.setVisible(true);
    }
    @FXML
    public void volverPrincipal(){
        panelBuscar.setVisible(false);
        panelCarrera.setVisible(false);
        panelEstudiante.setVisible(false);

        panelPrincipal.setVisible(true);
    }
}