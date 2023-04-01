/*
 * Esta é a classe que possui o ArrayList com os nomes dos alunos
 */

package springboot2.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import springboot2.domain.Aluno;

@RestController
public class AlunoController {
    private ArrayList<Aluno> alunos = new ArrayList<Aluno>();

    public AlunoController(){
        inserirAluno("Gabriel", "111111111");
        inserirAluno("Pedro", "222222222");
        inserirAluno("João", "333333333");
    }

    public void inserirAluno(String nome, String matricula){
        Aluno aluno = new Aluno(nome, matricula);
        alunos.add(aluno);
    }

    @GetMapping("/nomes")
    public ArrayList<Aluno> getNomes(){
        return alunos;
    }

}
