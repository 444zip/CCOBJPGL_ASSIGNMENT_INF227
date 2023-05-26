
<?xml version="1.0" encoding="UTF-8"?>

<?import javafx.scene.control.Button?>
<?import javafx.scene.control.Label?>
<?import javafx.scene.image.Image?>
<?import javafx.scene.image.ImageView?>
<?import javafx.scene.layout.AnchorPane?>
<?import javafx.scene.text.Font?>

<AnchorPane maxHeight="-Infinity" maxWidth="-Infinity" minHeight="-Infinity" minWidth="-Infinity" prefHeight="549.0" prefWidth="880.0" xmlns="http://javafx.com/javafx/19" xmlns:fx="http://javafx.com/fxml/1" fx:controller="controller.FruitController">
   <children>
      <ImageView fitHeight="123.0" fitWidth="134.0" layoutX="696.0" layoutY="178.0" pickOnBounds="true" preserveRatio="true">
         <image>
            <Image url="@../images/wendys.png" />
         </image>
      </ImageView>
      <ImageView fitHeight="137.0" fitWidth="143.0" layoutX="530.0" layoutY="178.0" pickOnBounds="true" preserveRatio="true">
         <image>
            <Image url="@../images/mcdonalds.png" />
         </image>
      </ImageView>
      <ImageView fitHeight="137.0" fitWidth="137.0" layoutX="217.0" layoutY="184.0" pickOnBounds="true" preserveRatio="true">
         <image>
            <Image url="@../images/burgerking.png" />
         </image>
      </ImageView>
      <Button fx:id="btn1" layoutX="55.0" layoutY="338.0" mnemonicParsing="false" onAction="#showInfo" prefHeight="42.0" prefWidth="134.0" style="-fx-background-color: #4172a5;" text="DOMINOS" textFill="#f2f2f2">
         <font>
            <Font name="Arial Black" size="14.0" />
         </font>
      </Button>
      <Button fx:id="btn3" layoutX="373.0" layoutY="338.0" mnemonicParsing="false" onAction="#showInfo" prefHeight="42.0" prefWidth="134.0" style="-fx-background-color: #EE3C40;" text="DQ" textFill="#007bc2">
         <font>
            <Font name="Arial Black" size="14.0" />
         </font>
      </Button>
      <Button fx:id="btn5" layoutX="690.0" layoutY="338.0" mnemonicParsing="false" onAction="#showInfo" prefHeight="42.0" prefWidth="134.0" style="-fx-background-color: #CF4044;" text="WENDYS" textFill="#fff22d">
         <font>
            <Font name="Arial Black" size="14.0" />
         </font>
      </Button>
      <Button fx:id="btn2" layoutX="218.0" layoutY="338.0" mnemonicParsing="false" onAction="#showInfo" prefHeight="42.0" prefWidth="134.0" style="-fx-background-color: #FDBD10;" text="BURGER KING" textFill="#0066b2">
         <font>
            <Font name="Arial Black" size="14.0" />
         </font>
      </Button>
      <Button fx:id="btn4" layoutX="532.0" layoutY="338.0" mnemonicParsing="false" onAction="#showInfo" prefHeight="42.0" prefWidth="134.0" style="-fx-background-color: #FEC300;" text="MCDONALD'S" textFill="#e90000">
         <font>
            <Font name="Arial Black" size="14.0" />
         </font>
      </Button>
      <Label layoutX="105.0" layoutY="84.0" prefHeight="87.0" prefWidth="669.0" text="PICK WHERE TO EAT: 🍴" textAlignment="CENTER" wrapText="true">
         <font>
            <Font name="Rockwell Extra Bold" size="48.0" />
         </font>
      </Label>
      <ImageView fitHeight="150.0" fitWidth="200.0" layoutX="39.0" layoutY="172.0" pickOnBounds="true" preserveRatio="true">
         <image>
            <Image url="@../images/dominos.png" />
         </image>
      </ImageView>
      <ImageView fitHeight="116.0" fitWidth="134.0" layoutX="373.0" layoutY="206.0" pickOnBounds="true" preserveRatio="true">
         <image>
            <Image url="@../images/dq.png" />
         </image>
      </ImageView>
   </children>
</AnchorPane>
