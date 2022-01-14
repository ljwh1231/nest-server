package com.jhlee.Blog.model.mapper;

import com.jhlee.Blog.dto.BoardDto;
import com.jhlee.Blog.model.Board;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.WARN)
public interface BoardMapper {

    BoardMapper INSTANCE = Mappers.getMapper(BoardMapper.class);

    Board toEntity(BoardDto boardDto);
    BoardDto toDto(Board board);
    List<Board> toEntityList(List<BoardDto> boardDtoList);
    List<BoardDto> toDtoList(List<Board> boardList);
}
