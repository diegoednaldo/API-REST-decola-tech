package com.github.diego.desafioapi.controllers.dto;

import com.github.diego.desafioapi.entities.News;
mport jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record NewsDto(
        Long id,
        String icon,
        String description
) {

    public NewsDto(News model) {
        this(model.getId(), model.getIcon(), model.getDescription());
    }

    public News toModel() {
        News model = new News();
        model.setId(this.id);
        model.setIcon(this.icon);
        model.setDescription(this.description);
        return model;
    }
}