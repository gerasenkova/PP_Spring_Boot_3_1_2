package ru.kata.spring.boot_security.demo.service;

import ru.kata.spring.boot_security.demo.model.Role;

import java.util.HashSet;
import java.util.List;

public interface RoleService {
    public List<Role> getAllRoles();

    public Role getRoleByName(String name);

    public HashSet<Role> getSetOfRoles(String[] roleNames);

    public void add(Role role);

    public void edit(Role role);

    public Role getById(int id);
}
