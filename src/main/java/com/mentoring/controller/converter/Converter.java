package com.mentoring.controller.converter;

/**
 * @author ivanovaolyaa
 * @version 12/12/2017
 */
public interface Converter<T, V> {

    T convertToEntity(V dto);

    V convertToDto(T entity);

    T update(T currentEntity, V dto);

}
