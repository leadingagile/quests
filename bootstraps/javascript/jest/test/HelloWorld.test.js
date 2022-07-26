import { helloWorld } from "../src/HelloWorld";

describe('HelloWorld', () => {
    it('returns Hello World', () => {
        expect(helloWorld()).toBe("Hello World")
    })
})