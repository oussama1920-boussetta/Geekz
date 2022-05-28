/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geekz;

/**
 *
 * @author bouss
 */
public class Promotion {

    public int GetPromotion;
    private reservation Res;

    public Promotion() {
    }

    public Promotion(int GetPromotion, int SetPromotion) {
        this.GetPromotion = GetPromotion;
    }

    public int getGetPromotion() {
        return GetPromotion;
    }

    @Override
    public String toString() {
        return "Promotion{" + "GetPromotion=" + GetPromotion + ", SetPromotion=" + '}';
    }
      public reservation getRes() {
        return Res;
    }

    public void setRes(reservation Res) {
        this.Res = Res;
    }
public static int PrixApresPromo(Promotion p ,reservation r){
return reservation.resTotalPrix(r)-p.GetPromotion;
        }

  
}
