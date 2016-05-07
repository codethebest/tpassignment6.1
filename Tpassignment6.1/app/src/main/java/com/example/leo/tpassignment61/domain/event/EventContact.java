package com.example.leo.tpassignment61.domain.event;

/**
 * Created by Leo on 4/18/2016.
 */
public class EventContact {

    private String id;
    private int phone;
    private String website;
    private String email;

    public EventContact ()
    {

    }

    public String getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getWebsite() {
        return website;
    }

    public int getPhone() {
        return phone;
    }


    public EventContact (Builder builder)
    {
        this.email = builder.email;
        this.phone = builder.phone;
        this.website = builder.website;
        this.id = builder.id;
    }

    public static class Builder
    {
        private int phone;
        private String website;
        private String email;
        private String id;

        public Builder phone(int value)
        {
            this.phone = value;
            return this;
        }

        public Builder id(String value) {
            this.id = value;
            return this;
        }

        public Builder website(String value)
        {
            this.website = value;
            return this;
        }
        public Builder email(String value)
        {
            this.email = value;
            return this;
        }

        public Builder copy(EventContact eventContact)
        {
            this.phone = eventContact.phone;
            this.website = eventContact.website;
            this.email = eventContact.email;
            this.id=eventContact.id;
            return this;
        }

        public EventContact build()
        {
            return new EventContact(this);
        }

    }
}
