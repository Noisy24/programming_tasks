public class Treg_Ravn {
     double height;
     double osnovanie;
     double bok_storona;

     public Treg_Ravn(double height, double osnovanie, double bok_storona) {
          this.height = height;
          this.osnovanie = osnovanie;
          this.bok_storona = bok_storona;
     }


     double getArea() {
          return height * osnovanie * 1/2;
     }

     double getPerimetr() {
          return bok_storona * 2 + osnovanie;
     }

     double getBok_storona() {
          return bok_storona;
     }

     void setBok_storona(double bok_storona) {
          if (bok_storona < 0) {
               this.bok_storona = 0;
               System.out.println("боковая сторона не может быть меньше 0");
          }
          else {
               this.bok_storona = bok_storona;
          }
     }

     double getOsnovanie() {
          return osnovanie;
     }

     void setOsnovanie(double osnovanie) {
          if (osnovanie < 0) {
               this.osnovanie = 0;
               System.out.println("основание не может быть меньше 0");
          }
          else {
               this.osnovanie = osnovanie;
          }
     }

     double getHeight() {
          return height;
     }

     void setHeight(double height) {
          if (height < 0) {
               this.height = 0;
               System.out.println("высота не может быть меньше 0");
          }
          else {
               this.height = height;
          }
     }
}
