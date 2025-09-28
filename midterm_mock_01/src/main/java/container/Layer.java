package container;

import function.Function;
import util.Activation;
import util.GenRandom;

public class Layer {
    private Neuron[] neurons;
    private Function function;

    public Layer(int inNeurons, int nNeurons, Function function) {
        this.neurons = new Neuron[nNeurons];
        this.function = function;
        for (int i = 0; i < nNeurons; i++) {
            double[] inputs = new double[inNeurons];
            for (int j = 0; j < inNeurons; j++) {
                inputs[j] = GenRandom.randomDouble(Neuron.getMinWeightValue(),Neuron.getMaxWeightValue());
            }
            double bias = GenRandom.randomDouble(0.0,1.0);
            neurons[i] = new Neuron(inputs, bias);
        }

    }
    public Layer(double[] input) {
        this.neurons = new Neuron[input.length];
        for (int i = 0; i < input.length; i++) neurons[i] = new Neuron(input[i]);
        this.function=null;
    }

    public double applyActivation(double x) throws IllegalArgumentException {
        switch(function) {
            case SIGMOID -> {
                return Activation.sigmoid(x);
            }
            case TANH -> {
                return Activation.tanh(x);
            }
            case RELU -> {
                return Activation.relu(x);
            }
            case null -> {
                throw new IllegalArgumentException("Unknown activation function: " + function);
            }
            default -> throw new IllegalArgumentException("Unknown activation function: " + function);

        }

    }

    public double applyActivationDerivative(double x) throws IllegalArgumentException {
        switch(function) {
            case SIGMOID -> {
                return Activation.sigmoidDerivative(x);
            }
            case TANH -> {
                return Activation.tanhDerivative(x);
            }
            case RELU -> {
                return Activation.reluDerivative(x);
            }
            case null -> {
                throw new IllegalArgumentException("Unknown activation function: " + function);
            }
            default -> throw new IllegalArgumentException("Unknown activation function: " + function);
        }
    }

    public Neuron[] getNeurons() {
        return neurons;
    }

    public void setNeurons(Neuron[] neurons) {
        this.neurons = neurons;
    }

    public Function getFunction() {
        return function;
    }

    public void setFunction(Function function) {
        this.function = function;
    }
}
