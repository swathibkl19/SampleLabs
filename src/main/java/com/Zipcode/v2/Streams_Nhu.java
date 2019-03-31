package com.Zipcode.v2;

public class Streams_Nhu {

        private long id;
        private String name;
        private String role;

        public Streams_Nhu(String name, long id) {
            this.name = name;
            this.id = id;
        }

        public Streams_Nhu(String name, long id, String role) {
            this.name = name;
            this.id = id;
            this.role = role;
        }

        public long getId() {
            return id;
        }

        public String getName(){
            return name;
        }

        public String getRole(){
            return role;
        }
    }

