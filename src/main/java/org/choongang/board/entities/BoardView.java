package org.choongang.board.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@IdClass(BoardViewId.class)
@Table(name="BOARD_VIEW")
public class BoardView {
    @Id
    private Long seq; // 게시글 번호

    @Id
    @Column(name="_uid")
    private int uid;
}
