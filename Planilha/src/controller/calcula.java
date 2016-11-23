package controller;

import javax.swing.JFrame;

import model.SpreadsheetModel;
import view.Spreadsheet;

public class calcula {

	public static void main(String[] args) {
		(new calcula()).run();
	}

	private void run() {
		SpreadsheetModel m = new SpreadsheetModel() {
			public void setFormula(String cell, String formula) {
				System.out.println(formula);
			}
			
			public String getValue(String cell) {
				return String.format("%06g", Math.random()*100 - 50);
			}

			@Override
			public String getFormula(String cell) {
				// TODO Auto-generated method stub
				return null;
			}
		};
		
		Spreadsheet window = new Spreadsheet(m);
		
	}
}


