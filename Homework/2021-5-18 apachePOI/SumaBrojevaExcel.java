package domaciPOI;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFFormulaEvaluator;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class SumaBrojevaExcel {

	public static void main(String[] args) {
		/*
		 * Napraviti novi projekat i u njega dodati biblioteke za apache poi. Kao na
		 * casu, doci do lokacije na vasem kompjuteru i tamo prekopirati fajl koji sam
		 * okacila (domaci.xlsx). Ako bude problema sa citanjem fajla koji vam okacih, a
		 * vi molim vas onda ipak kreirajte novi excel, posto radim na linuxu danas
		 * shvatismo da moze da se desi da se nesto izbagovalo. Napisati program koji
		 * racuna sumu brojeva koji se nalaze prvom sheet-u excel tabele koji se zove
		 * Brojevi. U tabeli svi brojevi se nalaze u prvoj koloni. Program treba da cita
		 * red po red iz tabele i upisane brojeve dodaje na sumu. Ukupnu sumu na kraju
		 * treba ispisati na standardnom izlazu. Potrebno je omoguciti da program radi i
		 * ukoliko se u datu tabelu doda jos brojeva.
		 */

		File f = new File("domaci.xlsx");

		try {
			InputStream in = new FileInputStream(f);
			XSSFWorkbook wb = new XSSFWorkbook(in);
			Sheet Brojevi = wb.getSheetAt(0);
			Iterator<Row> rowIterator = Brojevi.iterator();
			while (rowIterator.hasNext()) {
				Row row = rowIterator.next();
				Iterator<Cell> cellIterator = row.cellIterator();
				while (cellIterator.hasNext()) {
					Cell cell = cellIterator.next();

					if (cell.getCellType().name().equals("NUMERIC") && cell != null) {

						System.out.println(cell.getNumericCellValue() + ", ");
					}
				}

			}

			int lastCellNum = Brojevi.getRow(0).getLastCellNum();
			XSSFCell formulaCell = (XSSFCell) Brojevi.getRow(0).createCell(lastCellNum + 1);
			formulaCell.setCellFormula("SUM(A:A)");
			XSSFFormulaEvaluator formulaEvaluator = wb.getCreationHelper().createFormulaEvaluator();
			formulaEvaluator.evaluateFormulaCell(formulaCell);
			if (formulaCell != null) {
				System.out.println();
				System.out.println("Ukupna suma brojeva u tabeli je:  " + formulaCell.getNumericCellValue());
			}
			wb.close();

		} catch (FileNotFoundException e) {
			System.out.println("Fajl nije pronadjen.");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("GRESKA!");
			e.printStackTrace();
		}
	}

}
