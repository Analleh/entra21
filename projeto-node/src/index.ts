type Rect = {
    width?: number, /*Com '?' a propriedade não é obrigatória*/
    height?: number /*Com '?' a propriedade não é obrigatória*/
};

let rect: Rect = {
    width: 20,
    height: 30
};

let qua: Rect = {
    width: 30
};

type Triangle = {
    angle: number,
    type: "isoceles" | "scalene" | "obtuse"
};

let tri: Triangle = {
    angle: 45,
    type: "isoceles"
};

type Circle = {
    radius: number;
}

type GeometricFigure = Rect | Triangle | Circle;

let c: GeometricFigure = {
    radius: 5,
    width: 3,
    type: "scalene"
}