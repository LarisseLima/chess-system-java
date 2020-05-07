package chess.pieces;

import boardgame.Board;
import boardgame.Position;
import chess.ChessPiece;
import chess.Color;

public class Bishop extends ChessPiece {

	public Bishop(Board board, Color color) {
		super(board, color);
	}

	@Override
	public String toString() {
		return "B";
	}
	
	@Override
	public boolean[][] possibleMoves() {
		boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];
		
		Position p = new Position(0, 0);
		
		// nw
		p.SetValues(position.getRow() - 1, position.getColumm() - 1);
		while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
			mat[p.getRow()][p.getColumm()] = true;
			p.SetValues(p.getRow() - 1, p.getColumm() - 1);
		}
		if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
			mat[p.getRow()][p.getColumm()] = true;
		}
		
		// ne
		p.SetValues(position.getRow() - 1, position.getColumm() + 1);
		while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
			mat[p.getRow()][p.getColumm()] = true;
			p.SetValues(p.getRow() - 1, p.getColumm() + 1);
		}
		if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
			mat[p.getRow()][p.getColumm()] = true;
		}
		
		// se
		p.SetValues(position.getRow() + 1, position.getColumm() + 1);
		while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
			mat[p.getRow()][p.getColumm()] = true;
			p.SetValues(p.getRow() + 1, p.getColumm() + 1);
		}
		if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
			mat[p.getRow()][p.getColumm()] = true;
		}
		
		// sw
		p.SetValues(position.getRow() + 1, position.getColumm() - 1);
		while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
			mat[p.getRow()][p.getColumm()] = true;
			p.SetValues(p.getRow() + 1, p.getColumm() - 1);
		}
		if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
			mat[p.getRow()][p.getColumm()] = true;
		}
		
		return mat;
	}
}