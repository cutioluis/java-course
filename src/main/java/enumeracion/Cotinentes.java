package enumeracion;

public enum Cotinentes {

   TWITCH(12.4443),
   SNAPCHAT(89.333);

   private final double users;

   Cotinentes(double users) {
      this.users = users;
   }

   public double getUsers(double users) {
      return this.users;
   }
}
