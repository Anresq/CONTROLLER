package com.sami.sami_app.infrastructure.abstract_services;

import org.springframework.data.domain.Page;

public interface CrudService<REQUEST, RESPONSE, TYPE> {

    Page<RESPONSE> getAll(int page, int size);

    RESPONSE getById(TYPE id);

    RESPONSE create(REQUEST request);

    RESPONSE update(REQUEST request, TYPE id);

    void delete(Long id);

}
