package com.lti.demo;

public class Product1 {
	private int prdId;
	private String prdName;
	private double prdCost;
	public Product1(int prdId, String prdName, double prdCost) {
			super();
			this.prdId = prdId;
			this.prdName = prdName;
			this.prdCost = prdCost;
		}
		public int getPrdId() {
			return prdId;
		}
		public void setPrdId(int prdId) {
			this.prdId = prdId;
		}
		public String getPrdName() {
			return prdName;
		}
		public void setPrdName(String prdName) {
			this.prdName = prdName;
		}
		public double getPrdCost() {
			return prdCost;
		}
		public void setPrdCost(double prdCost) {
			this.prdCost = prdCost;
		}
		@Override
		public String toString() {
			return "Product1 [prdId=" + prdId + ", prdName=" + prdName + ", prdCost=" + prdCost + "]";
		}

}
