package FirstPackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Gobang {

	private static int BOARD_SIZE = 15;
	private String[][] Board;
	private void InitBoard(){
		Board = new String[BOARD_SIZE][BOARD_SIZE];
		for(int i=0;i<BOARD_SIZE;i++){
			for(int j=0;j<BOARD_SIZE;j++){
				Board[i][j] = "➕";
			}
		}
	}
	
	private void PrintBoard(){
		for(int i=0;i<BOARD_SIZE;i++){
			for(int j=0;j<BOARD_SIZE;j++){
				System.out.print(Board[i][j]);
			}
			System.out.print("\n");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gobang gb = new Gobang();
		gb.InitBoard();
		gb.PrintBoard();
		//获取键盘输入
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String inputStr = "";
		try {
			while((inputStr = br.readLine()) != null){
			String[] posStrArr = inputStr.split(",");
			int xPos = Integer.parseInt(posStrArr[0]);
			int yPos = Integer.parseInt(posStrArr[1]);
			gb.Board[xPos-1][yPos-1] = "×";
			gb.PrintBoard();
			System.out.print("请输入x，y坐标");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
