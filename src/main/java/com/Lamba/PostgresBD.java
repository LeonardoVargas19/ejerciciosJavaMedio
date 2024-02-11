package com.Lamba;

import java.util.List;

public class PostgresBD implements DatabaseService{
    @Override
    public String getById(Long id) {
        return STR."Getting data from Posgres with id \{id}";

    }

    @Override
    public List<String> getAllRecords() {
        return List.of("Helllo world");
    }
}
