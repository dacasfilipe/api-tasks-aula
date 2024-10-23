package com.senai.api.controllers;

import com.senai.api.entities.Tarefa;
import com.senai.api.repositories.TarefaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/tarefas") //localhost:8080/tarefas
public class TarefaController {
    // @GetMapping @PostMapping @PutMapping @DeleteMaping
    @Autowired
    TarefaRepository tarefaRepository;
    //Criar uma nova tarefa:** Adicionar uma nova tarefa à lista com título e descrição.

    //Listar todas as tarefas:** Retornar uma lista com todas as tarefas cadastradas.
    @GetMapping
    public List<Tarefa> getAllTasks(){
        return tarefaRepository.findAll();
    }
    //Buscar uma tarefa pelo ID:** Buscar uma tarefa específica pelo seu identificador único.

    //Atualizar uma tarefa:** Atualizar o título e/ou descrição de uma tarefa existente.

    //Remover uma tarefa:** Remover uma tarefa da lista.
}
