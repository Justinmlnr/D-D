package fr.campus.dungeoncrawler;

/**
 * Exception le lorsque la position du joueur dépasse la dernière case du plateau.
 */
public class OutOfBoardException extends Exception {
    public OutOfBoardException(String message) {
        super(message);
    }
}
