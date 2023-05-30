package com.company;

import Frames.MenuFrame;

import javax.swing.*;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {


        try {
            Words.loadWords();
            SavedData.createAttemptList();
            SavedData.readFromFile();
        } catch (IOException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Loading failed: "+ e.getMessage());
        }


        new MenuFrame(SavedData.getLastTheme());

    }
}
