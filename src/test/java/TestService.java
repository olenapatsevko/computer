import computer.exceptions.InvalidDataException;
import computer.service.CreatingService;
import computer.view.View;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class TestService {

    @Mock
    private View view;

    @InjectMocks
    private CreatingService creatingService;

    @Test
    public void creatingServiceTestInt() {
        when(view.inputInt(anyString())).thenReturn(1);
        assertEquals(1, creatingService.create().getComputerDataStorage());
    }

    @Test
    public void creatingServiceTestDouble() {
        when(view.inputDouble(anyString())).thenReturn(1.0);
        assertEquals(1.0, creatingService.create().getScreen(), 0.1);
    }

    @Test
    public void creatingServiceTestString() {
        when(view.inputString(anyString())).thenReturn("qwerty");
        assertEquals("qwerty", creatingService.create().getName());
    }

    @Test(expected = InvalidDataException.class)
    public void exceptionDoubleTest() {
        lenient().when(view.inputDouble(anyString())).thenThrow(InvalidDataException.class);
        creatingService.create();
    }

    @Test(expected = InvalidDataException.class)
    public void exceptionIntegerTest() {
        lenient().when(view.inputInt(anyString())).thenThrow(InvalidDataException.class);
        creatingService.create();
    }

    @Test(expected = InvalidDataException.class)
    public void exceptionStringTest() {
        lenient().when(view.inputString(anyString())).thenThrow(InvalidDataException.class);
        creatingService.create();
    }

    @Test
    public void verifyingCallQuantity() {
        when(view.inputInt(anyString())).thenReturn(1);
        when(view.inputDouble(anyString())).thenReturn(1.0);
        when(view.inputString(anyString())).thenReturn(anyString());
        creatingService.create();
        verify(view, times(4)).inputInt(anyString());
        verify(view, times(3)).inputDouble(anyString());
        verify(view, times(1)).inputString(anyString());
    }

}
