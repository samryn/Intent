package com.dicoding.picodiploma.myintentapp;

import android.os.Parcel;
import android.os.Parcelable;

public class Person implements Parcelable {

    private String name, email, city;
    private int age;
    protected Person(Parcel in){
        name = in.readString();
        email = in.readString();
        city = in.readString();
        age = in.readInt();
    }

    public static final Creator<Person> CREATOR = new Creator<Person>(){
        @Override
        public Person createFromParcel(Parcel in) {
            return new Person(in);
        }

        @Override
        public Person[] newArray(int size) {
            return new Person[size];
        }

    };
    public Person(String name, String email, String city, int age){
        this.name = name;
        this.email = email;
        this.city = city;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public String getCity() {
        return city;
    }
    public int getAge() {
        return age;
    }

    @Override
    public int describeContents(){
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i){
        parcel.writeString(name);
        parcel.writeString(email);
        parcel.writeString(city);
        parcel.writeInt(age);
    }
}