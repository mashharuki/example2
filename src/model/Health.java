package model;

import java.io.Serializable;

/**
 * フォーム
 * @author haruki
 */
public class Health implements Serializable {
	/**身長、体重、BMI*/
  private double height, weight, bmi;
  
  /**体系*/
  private String bodyType;

  /**
   * 身長を取得する。
   * @return
   */
  public double getHeight() {
    return height;
  }

  /**
   * 身長を格納する
   * @param height
   */
  public void setHeight(Double height) {
    this.height = height;
  }

  /**
   * 体重を取得する。
   * @return
   */
  public double getWeight() {
    return weight;
  }

  /**
   * 体重を格納する
   * @param weight
   */
  public void setWeight(Double weight) {
    this.weight = weight;
  }

  /**
   * BMIを格納
   * @param bmi
   */
  public void setBmi(Double bmi) {
    this.bmi = bmi;
  }

  /**
   * BMIを取得
   * @return
   */
  public double getBmi() {
    return this.bmi;
  }

  /**
   * 体型を格納する
   * @param bodyType
   */
  public void setBodyType(String bodyType) {
    this.bodyType = bodyType;
  }

  /**
   * 体型を取得する。
   * @return
   */
  public String getBodyType() {
    return this.bodyType;
  }
}