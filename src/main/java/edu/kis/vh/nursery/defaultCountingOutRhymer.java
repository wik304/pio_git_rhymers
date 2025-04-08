package edu.kis.vh.nursery;

/**
 * Klasa defaultCountingOutRhymer implementuje prostą strukturę stosu
 * przechowującą liczby całkowite. Pozwala na dodawanie, zdejmowanie
 * oraz podejrzenie ostatniego elementu, z dodatkowymi metodami pomocniczymi.
 */
public class defaultCountingOutRhymer {

    /**
     * Maksymalny rozmiar stosu.
     */
    private static final int MAX_SIZE = 12;

    /**
     * Wartość błędu domyślnego, używana gdy operacja się nie powiedzie.
     */
    private static final int DEFAULT_ERROR = -1;

    /**
     * Indeks informujący o pełnym stosie.
     */
    private static final int IF_FULL = 11;

    /**
     * Wartość błędu dla metody peekaboo, gdy stos jest pusty.
     */
    private static final int PEEKA_BOO_EMPTY_DEAFAULT_ERROR = -1;

    /**
     * Wartość błędu dla metody countOut, gdy stos jest pusty.
     */
    private static final int COUNT_OUT_DEFAULT_ERROR = -1;

    /**
     * Tablica przechowująca wartości w stosie.
     */
    private final int[] numbers = new int[MAX_SIZE];

    /**
     * Wskaźnik na szczyt stosu. Początkowo -1 oznacza pusty stos.
     */
    private int total = -1;

    /**
     * Zwraca maksymalny rozmiar stosu.
     *
     * @return maksymalna liczba elementów, które można dodać
     */
    public static int getMaxSize() {
        return MAX_SIZE;
    }

    /**
     * Zwraca domyślną wartość błędu.
     *
     * @return wartość oznaczająca błąd
     */
    public static int getDefaultError() {
        return DEFAULT_ERROR;
    }

    /**
     * Zwraca wartość indeksu, przy którym stos uznawany jest za pełny.
     *
     * @return indeks oznaczający pełny stos
     */
    public static int getIfFull() {
        return IF_FULL;
    }

    /**
     * Zwraca domyślną wartość błędu dla metody peekaboo.
     *
     * @return wartość błędu dla pustego stosu
     */
    public static int getPeekaBooEmptyDeafaultError() {
        return PEEKA_BOO_EMPTY_DEAFAULT_ERROR;
    }

    /**
     * Zwraca domyślną wartość błędu dla metody countOut.
     *
     * @return wartość błędu dla pustego stosu
     */
    public static int getCountOutDefaultError() {
        return COUNT_OUT_DEFAULT_ERROR;
    }

    /**
     * Zwraca bieżący wskaźnik szczytu stosu.
     *
     * @return indeks ostatniego elementu na stosie
     */
    public int getTotal() {
        return total;
    }

    /**
     * Dodaje element na szczyt stosu, jeśli nie jest pełny.
     *
     * @param in wartość do dodania
     */
    protected void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    /**
     * Sprawdza, czy stos jest pusty.
     *
     * @return true, jeśli stos jest pusty, w przeciwnym razie false
     */
    protected boolean callCheck() {
        return total == DEFAULT_ERROR;
    }

    /**
     * Sprawdza, czy stos jest pełny.
     *
     * @return true, jeśli stos osiągnął maksymalną pojemność
     */
    protected boolean isFull() {
        return total == IF_FULL;
    }

    /**
     * Zwraca wartość z wierzchołka stosu bez zdejmowania jej.
     *
     * @return wartość z wierzchołka stosu lub kod błędu, jeśli pusty
     */
    protected int peekaboo() {
        if (callCheck())
            return PEEKA_BOO_EMPTY_DEAFAULT_ERROR;
        return numbers[total];
    }

    /**
     * Zdejmuje i zwraca wartość z wierzchołka stosu.
     *
     * @return wartość z wierzchołka stosu lub kod błędu, jeśli pusty
     */
    protected int countOut() {
        if (callCheck())
            return COUNT_OUT_DEFAULT_ERROR;
        return numbers[total--];
    }

    /**
     * Zwraca wewnętrzną tablicę liczb (stos).
     *
     * @return tablica liczb
     */
    public int[] getNumbers() {
        return numbers;
    }
}
