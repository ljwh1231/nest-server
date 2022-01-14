package com.jhlee.Blog.model.mapper;

import com.jhlee.Blog.dto.BoardDto;
import com.jhlee.Blog.model.Board;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-12-28T19:13:09+0900",
    comments = "version: 1.4.1.Final, compiler: javac, environment: Java 11.0.12 (Oracle Corporation)"
)
@Component
public class BoardMapperImpl implements BoardMapper {

    @Override
    public Board toEntity(BoardDto boardDto) {
        if ( boardDto == null ) {
            return null;
        }

        Board board = new Board();

        board.setId( boardDto.getId() );
        board.setMember( boardDto.getMember() );
        board.setCategory( boardDto.getCategory() );
        board.setTitle( boardDto.getTitle() );
        board.setContents( boardDto.getContents() );
        board.setHits( boardDto.getHits() );
        board.setRegiDate( boardDto.getRegiDate() );
        board.setModiDate( boardDto.getModiDate() );

        return board;
    }

    @Override
    public BoardDto toDto(Board board) {
        if ( board == null ) {
            return null;
        }

        BoardDto boardDto = new BoardDto();

        boardDto.setId( board.getId() );
        boardDto.setMember( board.getMember() );
        boardDto.setCategory( board.getCategory() );
        boardDto.setTitle( board.getTitle() );
        boardDto.setContents( board.getContents() );
        boardDto.setHits( board.getHits() );
        boardDto.setRegiDate( board.getRegiDate() );
        boardDto.setModiDate( board.getModiDate() );

        return boardDto;
    }

    @Override
    public List<Board> toEntityList(List<BoardDto> boardDtoList) {
        if ( boardDtoList == null ) {
            return null;
        }

        List<Board> list = new ArrayList<Board>( boardDtoList.size() );
        for ( BoardDto boardDto : boardDtoList ) {
            list.add( toEntity( boardDto ) );
        }

        return list;
    }

    @Override
    public List<BoardDto> toDtoList(List<Board> boardList) {
        if ( boardList == null ) {
            return null;
        }

        List<BoardDto> list = new ArrayList<BoardDto>( boardList.size() );
        for ( Board board : boardList ) {
            list.add( toDto( board ) );
        }

        return list;
    }
}
