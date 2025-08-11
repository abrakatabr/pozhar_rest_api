package ru.pozhar.pozhar_rest_api.dto;

public record RequestUserDTO(String username, String email, String password, String role) {
}
