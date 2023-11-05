package lotto.config;

public enum LottoMessage {
    ENTER_PURCHASE_AMOUNT("구입금액을 입력해 주세요."),
    TICKET_PURCHASED_COUNT("%d개를 구매했습니다."),
    ENTER_WINNING_NUMBERS("당첨 번호를 입력해 주세요."),
    ENTER_BONUS_NUMBER("보너스 번호를 입력해 주세요."),
    WINNING_STATISTICS_HEADER("당첨 통계\n---\n"),
    MATCH_COUNT("%d개 일치"),
    MATCH_COUNT_WITH_BONUS("%d개 일치, 보너스 볼 일치"),
    MATCH_RESULT(" (%s원) - %d개\n"),
    TOTAL_PROFIT_RATE("총 수익률은 %.2f%%입니다.");

    private final String message;

    LottoMessage(String message, Object... args) {
        this.message = String.format(message, args);
    }

    public String getMessage() {
        return message;
    }

    public String getFormattedMessage(Object... args) {
        return String.format(message, args);
    }
}
