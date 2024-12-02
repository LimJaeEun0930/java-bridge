package bridge;

import static bridge.ErrorConstants.ERROR_HEADER;

import camp.nextstep.edu.missionutils.Console;

/**
 * 사용자로부터 입력을 받는 역할을 한다.
 */
public class InputView {


    public int readBridgeSize() {
        while (true) {
            try {
                String input = input("다리의 길이를 입력해주세요");
                int bridgeLength = Integer.parseInt(input);
                return bridgeLength;
            } catch (NumberFormatException e) {
                System.out.println(ERROR_HEADER + "정수를 입력해주세요");
            }
        }
    }

    /**
     * 사용자가 이동할 칸을 입력받는다.
     */
    public String readMoving() {
        return null;
    }

    /**
     * 사용자가 게임을 다시 시도할지 종료할지 여부를 입력받는다.
     */
    public String readGameCommand() {
        return null;
    }

    private String input(String displayMessage, Object... args) {
        System.out.printf(displayMessage + "%n", args);
        String input = Console.readLine();
        return input;
    }
}
