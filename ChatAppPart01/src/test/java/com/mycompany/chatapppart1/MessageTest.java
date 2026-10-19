/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chatapppart1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for the Message class.
 * These tests check message validation, message actions,
 * message hashes, and message counting.
 *
 * @author Student
 */
public class MessageTest {

    private Message message;

    @BeforeEach
    public void setUp() {
        // Create a message with a valid South African number.
        message = new Message(
                "+27821234567",
                "Hello, this is a test message.",
                0
        );
    }

    @Test
    public void testMessageIDIsValid() {
        // A generated message ID should be valid.
        assertTrue(message.checkMessageID());
    }

    @Test
    public void testRecipientCellIsValid() {
        // Check that a valid cellphone number is accepted.
        assertEquals(
                "Cell phone number successfully captured.",
                message.checkRecipientCell()
        );
    }

    @Test
    public void testMessageLengthIsValid() {
        // A message with fewer than 250 characters should be accepted.
        assertEquals(
                "Message ready to send.",
                message.checkMessageLength()
        );
    }

    @Test
    public void testMessageHashIsGenerated() {
        // The message hash should not be empty.
        assertNotNull(message.getMessageHash());
        assertFalse(message.getMessageHash().isEmpty());
    }

    @Test
    public void testSendMessage() {
        // Select the send message action.
        message.SentMessage("Send Message");

        // Check that the message was sent.
        assertEquals("SENT", message.getStatus());
    }

    @Test
    public void testDisregardMessage() {
        // Select the disregard message action.
        message.SentMessage("Disregard Message");

        // Check that the message was not marked as sent.
        assertNotEquals("SENT", message.getStatus());
    }

    @Test
    public void testStoreMessage() {
        // Select the store message action.
        message.SentMessage("Store Message");

        // Check that the message was not marked as sent.
        assertNotEquals("SENT", message.getStatus());
    }

    @Test
    public void testGetMessageID() {
        // Check that a message ID is returned.
        assertNotNull(message.getMessageID());
        assertFalse(message.getMessageID().isEmpty());
    }

    @Test
    public void testGetRecipient() {
        // Check that the correct recipient is returned.
        assertEquals("+27821234567", message.getRecipient());
    }

    @Test
    public void testGetMessage() {
        // Check that the correct message text is returned.
        assertEquals(
                "Hello, this is a test message.",
                message.getMessage()
        );
    }
}
